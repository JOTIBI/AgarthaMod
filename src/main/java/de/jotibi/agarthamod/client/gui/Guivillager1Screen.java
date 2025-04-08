package de.jotibi.agarthamod.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.gui.GuiGraphics;

import java.util.HashMap;

import de.jotibi.agarthamod.world.inventory.Guivillager1Menu;

import com.mojang.blaze3d.systems.RenderSystem;

public class Guivillager1Screen extends AbstractContainerScreen<Guivillager1Menu> {
	private final static HashMap<String, Object> guistate = Guivillager1Menu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	Button button_mr_h;
	Button button_stalin;

	public Guivillager1Screen(Guivillager1Menu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 176;
		this.imageHeight = 166;
	}

	private static final ResourceLocation texture = ResourceLocation.parse("agarthamod:textures/screens/guivillager_1.png");

	@Override
	public void render(GuiGraphics guiGraphics, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(guiGraphics, mouseX, mouseY, partialTicks);
		super.render(guiGraphics, mouseX, mouseY, partialTicks);
		this.renderTooltip(guiGraphics, mouseX, mouseY);
	}

	@Override
	protected void renderBg(GuiGraphics guiGraphics, float partialTicks, int gx, int gy) {
		RenderSystem.setShaderColor(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();
		guiGraphics.blit(texture, this.leftPos, this.topPos, 0, 0, this.imageWidth, this.imageHeight, this.imageWidth, this.imageHeight);
		RenderSystem.disableBlend();
	}

	@Override
	public boolean keyPressed(int key, int b, int c) {
		if (key == 256) {
			this.minecraft.player.closeContainer();
			return true;
		}
		return super.keyPressed(key, b, c);
	}

	@Override
	protected void renderLabels(GuiGraphics guiGraphics, int mouseX, int mouseY) {
		guiGraphics.drawString(this.font, Component.translatable("gui.agarthamod.guivillager_1.label_who_is_the_topguy"), 36, 19, -12829636, false);
	}

	@Override
	public void init() {
		super.init();
		button_mr_h = Button.builder(Component.translatable("gui.agarthamod.guivillager_1.button_mr_h"), e -> {
		}).bounds(this.leftPos + 22, this.topPos + 126, 51, 20).build();
		guistate.put("button:button_mr_h", button_mr_h);
		this.addRenderableWidget(button_mr_h);
		button_stalin = Button.builder(Component.translatable("gui.agarthamod.guivillager_1.button_stalin"), e -> {
		}).bounds(this.leftPos + 95, this.topPos + 126, 56, 20).build();
		guistate.put("button:button_stalin", button_stalin);
		this.addRenderableWidget(button_stalin);
	}
}
