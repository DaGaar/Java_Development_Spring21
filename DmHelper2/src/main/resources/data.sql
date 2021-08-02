insert into pc(id, name, level, perception_mod, insight_mod, ac, max_hp, initiative) 
	values (101, 'Baldwin Dasher', 3, 5, 2, 16, 23, 4);
insert into pc(id, name, level, perception_mod, insight_mod, ac, max_hp, initiative, xp) 
	values (102, 'Naome', 3, 7, 4, 14, 25, 4, 500);
insert into pc(id, name, level, perception_mod, insight_mod, ac, max_hp, initiative) 
	values (103, 'San Foldin', 3, 2, 1, 14, 30, 4);
insert into pc(id, name, level, perception_mod, insight_mod, ac, max_hp, initiative) 
	values (104, 'Tom Bimbles', 3, 8, 8, 13, 19, 4);
	
insert into pc(id, name, max_hp) 
	values (301, 'Matted Mohawk', 15);
insert into pc(id, name, max_hp) 
	values (302, 'lazy eye', 15);
insert into pc(id, name, max_hp) 
	values (303, 'Buff n armored', 42);
insert into pc(id, name, max_hp) 
	values (304, 'Limping Caster', 45);
--insert into pc(id, name, level, perception_mod, insight_mod, ac, max_hp, current_hp, initiative, total_crits, total_crit_fails, 
--	total_massive_dmgs, times_gone_down, total_hits, total_misses, total_dmg_done, total_dmg_taken, total_combats) 
--	values (105, 'Rodney Shanks', 3, 6, 2, 19, 32, 27, 4, 2, 3, 3, 2, 20, 8, 100, 50, 3);


insert into npc(id, name, dc, enemy, ally, perception_mod, insight_mod, ac, initiative) values (1, 'Mr. Nibbles', 1, false, true, 3, 1, 14, 3);
insert into npc(id, name, dc, enemy, ally, perception_mod, insight_mod, ac, initiative) values (2, 'orc1', .5, true, false, 3, 1, 14, 3);
insert into npc(id, name, dc, enemy, ally, perception_mod, insight_mod, ac, initiative) values (3, 'orc2', .5, true, false, 3, 1, 14, 3);
insert into npc(id, name, dc, enemy, ally, perception_mod, insight_mod, ac, initiative) values (4, 'orc3', .5, true, false, 3, 1, 14, 3);
insert into npc(id, name, dc, enemy, ally, perception_mod, insight_mod, ac, initiative) values (5, 'fatOrc', 1, true, false, 5, 4, 15, 3);
insert into npc(id, name, dc, enemy, ally, perception_mod, insight_mod, ac, initiative) values (6, 'halfOgre', 2, true, false, 2, 0, 13, 3);
insert into npc(id, name, dc, enemy, ally, perception_mod, insight_mod, ac, initiative) values (7, 'hostageGirl', 0, false, true, 6, 8, 12, 1);
insert into npc(id, name, dc, enemy, ally, perception_mod, insight_mod, ac, initiative) values (8, 'hostageBoy', 0, false, true, 7, 4, 12, 1);

--insert into victim(id, atked_id, dmg, effect) values (1, 104, 0, null)
--insert into victim(id, atked_id, dmg, effect) values (1, 103, 12, null)
--insert into victim(id, atked_id, dmg, effect) values (1, 101, 3, null)
--insert into victim(id, atked_id, dmg, effect) values (1, 104, 0, null)
--insert into victim(id, atked_id, dmg, effect) values (1, 104, 20, null)
--insert into victim(id, atked_id, dmg, effect) values (1, 103, 5, null)
--insert into victim(id, atked_id, dmg, effect) values (1, 102, 6, null)
--insert into victim(id, atked_id, dmg, effect) values (1, 101, 0, null)
--insert into victim(id, atked_id, dmg, effect) values (1, 104, 0, null)
--insert into victim(id, atked_id, dmg, effect) values (1, 103, 2, null)
--insert into victim(id, atked_id, dmg, effect) values (1, 101, 0, null)

insert into encounter(id, name) values (101, 'Betrayal');
insert into encounter(id, name) values (102, 'GoblinParty');
insert into encounter(id, name) values (103, 'orcsWithHostages');
insert into encounter(id, name) values (104, 'BossBattle');

insert into action(encounter_id, id, type, attacker_id, attacked_id, dmg_done, effect)
	values (101, 1, 'attack', 101, 104, 0, 'prone');
insert into action(encounter_id, id, type, attacker_id, attacked_id, dmg_done, effect) 
	values (101, 2, 'attack', 101, 103, 12, 'disarm');
insert into action(encounter_id, id, type, attacker_id, attacked_id, dmg_done)
	values (101, 3, 'attack', 102, 101, 3);
insert into action(encounter_id, id, type, attacker_id, attacked_id, dmg_done)
	values (101, 4, 'attack', 103, 104, 0);
insert into action(encounter_id, id, type, attacker_id, attacked_id, dmg_done)
	values (101, 5, 'attack', 102, 104, 20);
insert into action(encounter_id, id, type, attacker_id, attacked_id, dmg_done, effect)
	values (101, 6, 'attack', 104, 103, 5, 'prone');
insert into action(encounter_id, id, type, attacker_id, attacked_id, dmg_done)
	values (101, 8, 'attack', 103, 102, 6);
insert into action(encounter_id, id, type, attacker_id, attacked_id, dmg_done)
	values (101, 9, 'attack', 103, 101, 0);
insert into action(encounter_id, id, type, attacker_id, attacked_id, dmg_done)
	values (101, 10, 'attack', 103, 104, 0);
insert into action(encounter_id, id, type, attacker_id, attacked_id, dmg_done, effect)
	values (101, 11, 'attack', 104, 103, 2, 'shove');
insert into action(encounter_id, id, type, attacker_id, attacked_id, dmg_done)
	values (101, 12, 'attack', 102, 101, 0);