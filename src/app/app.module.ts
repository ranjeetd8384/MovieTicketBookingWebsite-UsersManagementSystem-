import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import {HttpClientModule} from '@angular/common/http';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { AboutComponent } from './about/about.component';
import { HomeComponent } from './home/home.component';
import { ContactComponent } from './contact/contact.component';
import { FormsModule } from '@angular/forms';
import { NewFormComponent } from './new-form/new-form.component'
import { ReactiveFormsModule} from '@angular/forms';
import { RegistrationFormComponent } from './registration-form/registration-form.component';
import { SigninComponent } from './signin/signin.component';
import { NavbarComponent } from './navbar/navbar.component';
import { UserlistComponent } from './userlist/userlist.component';
import { UpdateUserComponent } from './update-user/update-user.component';
import { BookingComponent } from './booking/booking.component';
import { UserdetailComponent } from './userdetail/userdetail.component'

@NgModule({
  declarations: [
    AppComponent,
    AboutComponent,
    HomeComponent,
    ContactComponent,
    NewFormComponent,
    RegistrationFormComponent,
    SigninComponent,
    NavbarComponent,
    UserlistComponent,
    UpdateUserComponent,
    BookingComponent,
    UserdetailComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    FormsModule,
    ReactiveFormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
