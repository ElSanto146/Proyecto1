import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { HomeComponent } from './componentes/home/home.component';
import { LoginComponent } from './componentes/login/login.component';
import { AppComponent } from './app.component';
import { NewHabilidadComponent } from './componentes/habilidades/new-habilidad/new-habilidad.component';

const routes: Routes = [
  //{path:'', redirectTo:'/inicio', pathMatch:'full'},
  {path:'', redirectTo:'/inicio', pathMatch:'full'},
  {path:'inicio', component: HomeComponent},
  {path:'login', component: LoginComponent},
  {path:'nuevahabi', component: NewHabilidadComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
