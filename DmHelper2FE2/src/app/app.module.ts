import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppComponent } from './app.component';
import { SomethingHappensComponent } from './something-happens/something-happens.component';

@NgModule({
  declarations: [
    AppComponent,
    SomethingHappensComponent
  ],
  imports: [
    BrowserModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
