package ru.netology.conditional.profile;

/**
 * @author Viktor_Loskutov
 */
public class DevProfile implements SystemProfile {
	@Override
	public String getProfile() {
		return "Current profile is dev";
	}
}