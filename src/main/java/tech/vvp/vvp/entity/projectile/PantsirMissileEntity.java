package tech.vvp.vvp.entity.projectile;

import com.atsuishio.superbwarfare.entity.projectile.Ru9m336MissileEntity;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.network.RegistryFriendlyByteBuf;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.level.Level;
import net.minecraft.world.phys.Vec3;
import org.jetbrains.annotations.NotNull;
import tech.vvp.vvp.entity.vehicle.PantsirS1Entity;

/**
 * Ракета 57Э6 для ЗРПК Панцирь-С1.
 * Наведение — стандартная логика SBW ({@link Ru9m336MissileEntity}).
 */
public class PantsirMissileEntity extends Ru9m336MissileEntity {

    private int launcherEntityId = -1;

    public PantsirMissileEntity(EntityType<? extends PantsirMissileEntity> type, Level level) {
        super(type, level);
    }

    @Override
    public void tick() {
        super.tick();

        if (tickCount == 1 && launcherEntityId == -1) {
            Entity owner = getOwner();
            if (owner != null && owner.getVehicle() instanceof PantsirS1Entity pantsir) {
                launcherEntityId = pantsir.getId();
            }
        }
    }

    @Override
    public void readAdditionalSaveData(@NotNull CompoundTag compound) {
        super.readAdditionalSaveData(compound);
        launcherEntityId = compound.getInt("LauncherId");
    }

    @Override
    public void addAdditionalSaveData(@NotNull CompoundTag compound) {
        super.addAdditionalSaveData(compound);
        compound.putInt("LauncherId", launcherEntityId);
    }

    @Override
    public void writeSpawnData(RegistryFriendlyByteBuf buffer) {
        buffer.writeInt(launcherEntityId);
    }

    @Override
    public void readSpawnData(RegistryFriendlyByteBuf buffer) {
        this.launcherEntityId = buffer.readInt();
    }

    public int getLauncherId() {
        return launcherEntityId;
    }

    public void setInitialRotation(Vec3 direction) {
        double horizontalDist = Math.sqrt(direction.x * direction.x + direction.z * direction.z);
        float yaw = (float) (-Math.atan2(direction.x, direction.z) * 180.0 / Math.PI);
        float pitch = (float) (-Math.atan2(direction.y, horizontalDist) * 180.0 / Math.PI);

        setYRot(yaw);
        setXRot(pitch);
        yRotO = yaw;
        xRotO = pitch;
    }

    @Override
    public float getVolume() {
        return 0.5f;
    }
}