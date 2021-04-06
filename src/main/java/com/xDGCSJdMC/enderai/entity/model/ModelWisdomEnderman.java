package com.xDGCSJdMC.enderai.entity.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class ModelWisdomEnderman extends ModelBiped
{
    /** Is the enderman carrying a block? */
    public boolean isCarrying;
    /** Is the enderman attacking an entity? */
    public boolean isAttacking;

   

    public ModelWisdomEnderman()
    {
    	super(0.0F, -14.0F, 64, 32);
        float f = -14.0F;
        this.bipedHeadwear = new ModelRenderer(this, 0, 16);
        this.bipedHeadwear.addBox(-4.0F, -8.0F, -4.0F, 8, 8, 8, - 0.5F);
        this.bipedHeadwear.setRotationPoint(0.0F, -14.0F, 0.0F);
        this.bipedBody = new ModelRenderer(this, 32, 16);
        this.bipedBody.addBox(-4.0F, 0.0F, -2.0F, 8, 12, 4);
        this.bipedBody.setRotationPoint(0.0F, -14.0F, 0.0F);
        this.bipedRightArm = new ModelRenderer(this, 56, 0);
        this.bipedRightArm.addBox(-1.0F, -2.0F, -1.0F, 2, 30, 2);
        this.bipedRightArm.setRotationPoint(-3.0F, -12.0F, 0.0F);
        this.bipedLeftArm = new ModelRenderer(this, 56, 0);
        this.bipedLeftArm.mirror = true;
        this.bipedLeftArm.addBox(-1.0F, -2.0F, -1.0F, 2, 30, 2);
        this.bipedLeftArm.setRotationPoint(5.0F, -12.0F, 0.0F);
        this.bipedRightLeg = new ModelRenderer(this, 56, 0);
        this.bipedRightLeg.addBox(-1.0F, 0.0F, -1.0F, 2, 30, 2);
        this.bipedRightLeg.setRotationPoint(-2.0F, -2.0F, 0.0F);
        this.bipedLeftLeg = new ModelRenderer(this, 56, 0);
        this.bipedLeftLeg.mirror = true;
        this.bipedLeftLeg.addBox(-1.0F, 0.0F, -1.0F, 2, 30, 2);
        this.bipedLeftLeg.setRotationPoint(2.0F, -2.0F, 0.0F);

        
    }

    @Override
    public void setRotationAngles(float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch, float scale, Entity entity)
    {
        super.setRotationAngles(limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scale, entity);
        this.bipedHead.showModel = true;
        float f6 = -14.0F;
        this.bipedBody.rotateAngleX = 0.0F;
        this.bipedBody.rotationPointY = f6;
        this.bipedBody.rotationPointZ = -0.0F;
        this.bipedRightLeg.rotateAngleX -= 0.0F;
        this.bipedLeftLeg.rotateAngleX -= 0.0F;
        this.bipedRightArm.rotateAngleX = (float)(this.bipedRightArm.rotateAngleX * 0.5D);
        this.bipedLeftArm.rotateAngleX = (float)(this.bipedLeftArm.rotateAngleX * 0.5D);
        this.bipedRightLeg.rotateAngleX = (float)(this.bipedRightLeg.rotateAngleX * 0.5D);
        this.bipedLeftLeg.rotateAngleX = (float)(this.bipedLeftLeg.rotateAngleX * 0.5D);
        float f7 = 0.4F;

        if (this.bipedRightArm.rotateAngleX > f7)
        {
            this.bipedRightArm.rotateAngleX = f7;
        }
        if (this.bipedLeftArm.rotateAngleX > f7)
        {
            this.bipedLeftArm.rotateAngleX = f7;
        }
        if (this.bipedRightArm.rotateAngleX < -f7)
        {
            this.bipedRightArm.rotateAngleX = -f7;
        }
        if (this.bipedLeftArm.rotateAngleX < -f7)
        {
            this.bipedLeftArm.rotateAngleX = -f7;
        }
        if (this.bipedRightLeg.rotateAngleX > f7)
        {
            this.bipedRightLeg.rotateAngleX = f7;
        }
        if (this.bipedLeftLeg.rotateAngleX > f7)
        {
            this.bipedLeftLeg.rotateAngleX = f7;
        }
        if (this.bipedRightLeg.rotateAngleX < -f7)
        {
            this.bipedRightLeg.rotateAngleX = -f7;
        }
        if (this.bipedLeftLeg.rotateAngleX < -f7)
        {
            this.bipedLeftLeg.rotateAngleX = -f7;
        }

        if (this.isCarrying)
        {
            this.bipedRightArm.rotateAngleX = -0.5F;
            this.bipedLeftArm.rotateAngleX = -0.5F;
            this.bipedRightArm.rotateAngleZ = 0.05F;
            this.bipedLeftArm.rotateAngleZ = -0.05F;
        }

        this.bipedRightArm.rotationPointZ = 0.0F;
        this.bipedLeftArm.rotationPointZ = 0.0F;
        this.bipedRightLeg.rotationPointZ = 0.0F;
        this.bipedLeftLeg.rotationPointZ = 0.0F;
        this.bipedRightLeg.rotationPointY = 9.0F + f6;
        this.bipedLeftLeg.rotationPointY = 9.0F + f6;
        this.bipedHead.rotationPointZ = -0.0F;
        this.bipedHead.rotationPointY = f6 + 1.0F;
        this.bipedHeadwear.rotationPointX = this.bipedHead.rotationPointX;
        this.bipedHeadwear.rotationPointY = this.bipedHead.rotationPointY;
        this.bipedHeadwear.rotationPointZ = this.bipedHead.rotationPointZ;
        this.bipedHeadwear.rotateAngleX = this.bipedHead.rotateAngleX;
        this.bipedHeadwear.rotateAngleY = this.bipedHead.rotateAngleY;
        this.bipedHeadwear.rotateAngleZ = this.bipedHead.rotateAngleZ;

        
        }


    @Override
    public void render(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch, float scale)
    {
        super.render(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scale);
        this.setRotationAngles(limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scale, entity);
        
    }
}