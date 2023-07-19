import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { HomeComponent } from './home/home.component';
import { AboutusComponent } from './aboutus/aboutus.component';
import { LoginComponent } from './login/login.component';
import { TestParamComponent } from './test-param/test-param.component';
import { WelcomeComponent } from './welcome/welcome.component';
import { ProductsComponent } from './products/products.component';

const routes: Routes = [
    {path:"", component:HomeComponent},  // default page
    {path:"home", component:HomeComponent},
    {path:"about", component:AboutusComponent},
    {path:"login", component:LoginComponent},
    {path:"test/:id", component:TestParamComponent},
    {path:"welcome", component:WelcomeComponent}, 
    {path:"prdinfo/:brand", component:ProductsComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
