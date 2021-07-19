insert into pc(id, name, level, perception_mod, insight_mod, ac, max_hp, initiative) 
	values (101, 'Baldwin Dasher', 3, 5, 2, 16, 23, 4);
insert into pc(id, name, level, perception_mod, insight_mod, ac, max_hp, initiative, xp) 
	values (102, 'Naome', 3, 7, 4, 14, 25, 4, 500);
insert into pc(id, name, level, perception_mod, insight_mod, ac, max_hp, initiative) 
	values (103, 'San Foldin', 3, 2, 1, 14, 30, 4);
insert into pc(id, name, level, perception_mod, insight_mod, ac, max_hp, initiative) 
	values (104, 'Tom Bimbles', 3, 8, 8, 13, 19, 4);
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

insert into encounter_combat(id, name, dificulty) values (101, 'orcsWithHostages', 4);

insert into action(id, encounter_combat, attacker_id, attacked_id, dmg_done)
	values (1, 101, 101, 104, 10);
insert into action(id, encounter_combat, attacker_id, attacked_id, dmg_done) 
	values (2, 101, 101, 103, 12);
insert into action(id, encounter_combat, attacker_id, attacked_id, dmg_done)
	values (3, 101, 102, 101, 3);
insert into action(id, encounter_combat, attacker_id, attacked_id, dmg_done)
	values (4, 101, 103, 104, 13);