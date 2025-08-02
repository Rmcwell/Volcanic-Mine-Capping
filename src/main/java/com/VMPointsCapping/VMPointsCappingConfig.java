package com.VMPointsCapping;

import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigGroup;
import net.runelite.client.config.ConfigItem;

import java.awt.*;

@ConfigGroup("volcanic-mine-capping")
public interface VMPointsCappingConfig extends Config
{
	@ConfigItem(
		keyName = "startTimerNotifier",
		name = "Start Timer Notification",
		description = "Notifies when the game begins",
		position = 1
	)
	default boolean startTimerNotifier()
	{
		return false;
	}

	@ConfigItem(
			keyName = "waitingStairsColor",
			name = "Waiting Stairs Color",
			description = "Configures the color of the stairs when waiting for the game begins",
			position = 2
	)
	default Color waitingStairsColor()
	{
		return Color.red;
	}

	@ConfigItem(
			keyName = "startingStairsColor",
			name = "Starting Stairs Color",
			description = "Configures the color of the stairs when the game begins",
			position = 3
	)
	default Color startingStairsColor()
	{
		return Color.green;
	}



}
