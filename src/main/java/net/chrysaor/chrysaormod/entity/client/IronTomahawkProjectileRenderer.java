package net.chrysaor.chrysaormod.entity.client;

import net.chrysaor.chrysaormod.ChrysaorMod;
import net.chrysaor.chrysaormod.entity.custom.IronTomahawkProjectileEntity;
import net.minecraft.client.render.OverlayTexture;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.EntityRenderer;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.item.ItemRenderer;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.RotationAxis;

public class IronTomahawkProjectileRenderer extends EntityRenderer<IronTomahawkProjectileEntity> {
    protected IronTomahawkProjectileModel model;


    public IronTomahawkProjectileRenderer(EntityRendererFactory.Context ctx) {
        super(ctx);
        this.model = new IronTomahawkProjectileModel(ctx.getPart(IronTomahawkProjectileModel.TOMAHAWK));
    }

    @Override
    public void render(IronTomahawkProjectileEntity entity, float yaw, float tickDelta, MatrixStack matrices,
                       VertexConsumerProvider vertexConsumers, int light) {
        matrices.push();

        if (!entity.isGrounded()) {
            matrices.multiply(RotationAxis.POSITIVE_Y.rotationDegrees(MathHelper.lerp(tickDelta, entity.prevYaw, entity.getYaw())));
            matrices.multiply(RotationAxis.POSITIVE_X.rotationDegrees(entity.getRenderingRotation() * 5f));
            matrices.translate(0, -1.0f, 0);
        } else {
            matrices.multiply(RotationAxis.POSITIVE_Y.rotationDegrees(entity.groundedOffset.getY()));
            matrices.multiply(RotationAxis.POSITIVE_X.rotationDegrees(entity.groundedOffset.getX()));
            matrices.translate(0, -1.0f, 0);
        }

        VertexConsumer vertexConsumer = ItemRenderer.getDirectItemGlintConsumer(vertexConsumers,
                this.model.getLayer(Identifier.of(ChrysaorMod.MOD_ID, "textures/entity/tomahawk/iron_tomahawk.png")), false, false);
        this.model.render(matrices, vertexConsumer, light, OverlayTexture.DEFAULT_UV);

        matrices.pop();
        super.render(entity, yaw, tickDelta, matrices, vertexConsumers, light);
    }

    @Override
    public Identifier getTexture(IronTomahawkProjectileEntity entity) {
        return Identifier.of(ChrysaorMod.MOD_ID, "textures/entity/tomahawk/iron_tomahawk.png");
    }
}