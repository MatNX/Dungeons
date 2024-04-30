package com.matnx.dungeons.network;

import com.matnx.dungeons.DungeonsMod;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.level.ServerPlayer;
import net.minecraftforge.network.ChannelBuilder;
import net.minecraftforge.network.NetworkDirection;
import net.minecraftforge.network.PacketDistributor;
import net.minecraftforge.network.SimpleChannel;

public class Channel {
    public static final SimpleChannel INSTANCE = ChannelBuilder.named(
      new ResourceLocation(DungeonsMod.MODID, "main"))
            .serverAcceptedVersions((s, v) -> true)
            .clientAcceptedVersions((s, v) -> true)
            .networkProtocolVersion(1)
            .simpleChannel();

    public static void init() {
        INSTANCE.messageBuilder(PaintPacket.class, NetworkDirection.PLAY_TO_CLIENT)
                .encoder(PaintPacket::encode)
                .decoder(PaintPacket::new)
                .consumerMainThread(PaintPacket::handle)
                .add();
    }

    public static void sendToClient(Object msg, ServerPlayer player) {
        INSTANCE.send(msg, PacketDistributor.PLAYER.with(player));
    }
}
