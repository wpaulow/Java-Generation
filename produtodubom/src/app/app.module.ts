import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { FormsModule } from '@angular/forms';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { NavbarComponent } from './componentes/navbar/navbar.component';
import { LoginComponent } from './componentes/login/login.component';
import { LogoutComponent } from './componentes/logout/logout.component';
import { ListagemComponent } from './componentes/listagem/listagem.component';
import { InicioComponent } from './componentes/inicio/inicio.component';
import { TituloComponent } from './componentes/titulo/titulo.component';
import { HttpClientModule } from '@angular/common/http';

@NgModule({
  declarations: [
    AppComponent,
    NavbarComponent,
    LoginComponent,
    LogoutComponent,
    ListagemComponent,
    InicioComponent,
    TituloComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    FormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
