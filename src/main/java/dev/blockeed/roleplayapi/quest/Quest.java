package dev.blockeed.roleplayapi.quest;

/*
 * Copyright (c) Blockeed | All rights reserved
 *
 * Do not change the code!
 *
 */

import net.citizensnpcs.api.npc.NPC;

import java.util.List;

public class Quest {

    private String name;
    private NPC taskerNPC;
    private List<QuestReward> rewards;
    private Quest requiredQuest;
    private int requiredLevel;

    public Quest(String name, NPC taskerNPC, List<QuestReward> rewards, Quest requiredQuest, int requiredLevel) {
        this.name=name;
        this.taskerNPC=taskerNPC;
        this.rewards=rewards;
        this.requiredQuest=requiredQuest;
        this.requiredLevel=requiredLevel;
    }

    public String getName() {
        return name;
    }

    public int getRequiredLevel() {
        return requiredLevel;
    }

    public List<QuestReward> getRewards() {
        return rewards;
    }

    public NPC getTaskerNPC() {
        return taskerNPC;
    }

    public Quest getRequiredQuest() {
        return requiredQuest;
    }
}
