import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { CombatComponent } from './combat/combat.component';
import { ActionLogComponent } from './action-log/action-log.component';
import { CharacterListComponent } from './character-list/character-list.component';
import { CharacterStatsComponent } from './character-stats/character-stats.component';
import { CreateCharacterComponent } from './create-character/create-character.component';
import { CreateEncounterComponent } from './create-encounter/create-encounter.component';

const routes : Routes = [
	{path : 'combat', component: CombatComponent},
	{path : 'action-log', component: ActionLogComponent},
	{path : 'characters', component: CharacterListComponent},
	{path : 'create-encounter', component: CreateEncounterComponent},
	{path : '', redirectTo: 'characters', pathMatch: 'full'},
	{path: 'character-stats/:id', component: CharacterStatsComponent},
	{path: 'create-character', component: CreateCharacterComponent}

]

@NgModule({
	declarations: [],
	imports: [
		RouterModule.forRoot(routes)
	],
	exports: [RouterModule]
})
export class AppRoutingModule { }
