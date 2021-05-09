package com.binary_studio.fleet_commander.core.ship;

import java.util.Optional;

import com.binary_studio.fleet_commander.core.actions.attack.AttackAction;
import com.binary_studio.fleet_commander.core.actions.defence.AttackResult;
import com.binary_studio.fleet_commander.core.actions.defence.RegenerateAction;
import com.binary_studio.fleet_commander.core.common.Attackable;
import com.binary_studio.fleet_commander.core.common.PositiveInteger;
import com.binary_studio.fleet_commander.core.ship.contract.CombatReadyVessel;
import com.binary_studio.fleet_commander.core.subsystems.contract.AttackSubsystem;
import com.binary_studio.fleet_commander.core.subsystems.contract.DefenciveSubsystem;

public final class CombatReadyShip implements CombatReadyVessel {

	private  String name;
	private  PositiveInteger speed;
	private  PositiveInteger size;
	private  PositiveInteger capacitorRechargeRate;
	private  PositiveInteger initialShieldHP;
	private  PositiveInteger initialHullHP;
	private  PositiveInteger initialCapacitorAmount;
	private PositiveInteger shieldHP;
	private PositiveInteger hullHP;
	private PositiveInteger capacitorAmount;
	private  AttackSubsystem attackSubsystem;
	private  DefenciveSubsystem defenciveSubsystem;

	public CombatReadyShip(String name, PositiveInteger shieldHP, PositiveInteger hullHP,
						   PositiveInteger capacitorAmount, PositiveInteger capacitorRechargeRate, PositiveInteger speed,
						   PositiveInteger size, AttackSubsystem attackSubsystem, DefenciveSubsystem defenciveSubsystem) {
		this.name = name;
		this.shieldHP = shieldHP;
		this.initialShieldHP = shieldHP;
		this.hullHP = hullHP;
		this.initialHullHP = hullHP;
		this.capacitorAmount = capacitorAmount;
		this.initialCapacitorAmount = capacitorAmount;
		this.capacitorRechargeRate = capacitorRechargeRate;
		this.speed = speed;
		this.size = size;
		this.attackSubsystem = attackSubsystem;
		this.defenciveSubsystem = defenciveSubsystem;
	}

	@Override
	public void endTurn() {
		// TODO: Ваш код здесь :)

	}

	@Override
	public void startTurn() {
		// TODO: Ваш код здесь :)

	}

	@Override
	public String getName() {
		return this.name;
	}

	@Override
	public PositiveInteger getSize() {
		return this.size;
	}

	@Override
	public PositiveInteger getCurrentSpeed() {
		return this.speed;
	}

	@Override
	public Optional<AttackAction> attack(Attackable target) {
		return null;
	}

	@Override
	public AttackResult applyAttack(AttackAction attack) {
		// TODO: Ваш код здесь :)
		return null;
	}

	@Override
	public Optional<RegenerateAction> regenerate() {
		// TODO: Ваш код здесь :)
		return null;
	}

}
