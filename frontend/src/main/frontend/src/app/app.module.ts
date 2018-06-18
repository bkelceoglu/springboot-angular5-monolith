import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppComponent } from './app.component';
import { UserComponentComponent } from './user-component/user-component.component';
import { AppRoutingModule } from './/app-routing.module';
import { UserComponentService } from './user-component/user-component.service';
import { HttpClientModule } from '@angular/common/http';

@NgModule({
  declarations: [
    AppComponent,
    UserComponentComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule
  ],
  providers: [UserComponentService],
  bootstrap: [AppComponent]
})
export class AppModule { }
