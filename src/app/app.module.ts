import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { ListComponent } from './list/list.component';
import { CreateComponent } from './create/create.component';
import { FormsModule } from '@angular/forms';
import {HttpClient, HttpClientModule} from '@angular/common/http'
import { RouterModule } from '@angular/router';
import { UpdateComponent } from './update/update.component';



@NgModule({
  declarations: [
    AppComponent,
    ListComponent,
    CreateComponent,
    UpdateComponent,
   
   
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,FormsModule,HttpClientModule,RouterModule
   
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
