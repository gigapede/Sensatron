package org.aardvark.sensatron.model;

import java.util.Arrays;

public class LightParams implements Cloneable {
	
	public static final int MODE_SPECTRUM = 1;
	
	private boolean on = true;
	private boolean flashlight;
	private int mode = MODE_SPECTRUM;
	private int hue1 = 0;
	private int hue2 = 255;
	private int saturation = 100;
	private int slider4;
	private int[] pitchSliders = new int[12];

	public boolean isOn() {
		return on;
	}

	public void setOn(boolean on) {
		this.on = on;
	}

	@Override
	public String toString() {
		return "LightParams [on=" + on + ", flashlight=" + flashlight + ", mode=" + mode + ", hue1=" + hue1 + ", hue2="
				+ hue2 + ", saturation=" + saturation + ", slider4=" + slider4 + ", pitchSliders="
				+ Arrays.toString(pitchSliders) + "]";
	}

	@Override
	public LightParams clone() throws CloneNotSupportedException {
		return (LightParams) super.clone();
	}

	public int getMode() {
		return mode;
	}

	public void setMode(int mode) {
		this.mode = mode;
	}

	public int getHue1() {
		return hue1;
	}

	public void setHue1(int hue1) {
		this.hue1 = hue1;
	}

	public int getHue2() {
		return hue2;
	}

	public void setHue2(int hue2) {
		this.hue2 = hue2;
	}

	public int getSaturation() {
		return saturation;
	}

	public void setSaturation(int saturation) {
		this.saturation = saturation;
	}

	public int getSlider4() {
		return slider4;
	}

	public void setSlider4(int slider4) {
		this.slider4 = slider4;
	}

	public int[] getPitchSliders() {
		return pitchSliders;
	}

	public void setPitchSliders(int[] pitchSliders) {
		this.pitchSliders = pitchSliders;
	}

	public boolean isFlashlight() {
		return flashlight;
	}

	public void setFlashlight(boolean flashlight) {
		this.flashlight = flashlight;
	}
}
