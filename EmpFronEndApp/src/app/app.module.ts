import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { NgbModule } from '@ng-bootstrap/ng-bootstrap';
import { HttpClientModule } from '@angular/common/http';
import { ViewAllEmpsComponent } from './view-all-emps/view-all-emps.component';
import { NewempComponent } from './newemp/newemp.component';
import { ViewEmpComponent } from './view-emp/view-emp.component';
import { UpateEmpComponent } from './upate-emp/upate-emp.component';
import { NgxPaginationModule } from 'ngx-pagination'
@NgModule({
  declarations: [
    AppComponent,
    ViewAllEmpsComponent,
    NewempComponent,
    ViewEmpComponent,
    UpateEmpComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    NgbModule, FormsModule, HttpClientModule, NgxPaginationModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
