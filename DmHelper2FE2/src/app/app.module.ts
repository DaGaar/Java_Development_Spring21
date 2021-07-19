import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppComponent } from './app.component';
import { SomethingHappensComponent } from './something-happens/something-happens.component';
import { CombatComponent } from './combat/combat.component';
import { AppRoutingModule } from './app-routing-module';
import { HttpClientModule } from '@angular/common/http';
import { FormsModule } from '@angular/forms';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { ActionLogComponent } from './action-log/action-log.component';
import { CharacterListComponent } from './character-list/character-list.component';
import { CharacterStatsComponent } from './character-stats/character-stats.component';


@NgModule({
  declarations: [
    AppComponent,
    SomethingHappensComponent,
    CombatComponent,
    ActionLogComponent,
    CharacterListComponent,
    CharacterStatsComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    FormsModule,
    BrowserModule,
    BrowserAnimationsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
