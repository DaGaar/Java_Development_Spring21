import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { CombatComponent } from './combat/combat.component';
import { ActionLogComponent } from './action-log/action-log.component';
import { CharacterListComponent } from './character-list/character-list.component';
import { CharacterStatsComponent } from './character-stats/character-stats.component';


const routes : Routes = [
	{path : 'combat', component: CombatComponent},
	{path : 'action-log', component: ActionLogComponent},
	{path : 'characters', component: CharacterListComponent},
	{path: 'character-stats/:id', component: CharacterStatsComponent}

]

@NgModule({
	declarations: [],
	imports: [
		RouterModule.forRoot(routes)
	],
	exports: [RouterModule]
})
export class AppRoutingModule { }
