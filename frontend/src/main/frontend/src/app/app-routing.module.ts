import { AppComponent } from './app.component';
import { UserComponentComponent } from './user-component/user-component.component';
import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { NavigationComponent } from './navigation/navigation.component';


const routes: Routes = [
  {path: '', component: AppComponent},
  {path: 'allusers', component: UserComponentComponent}
];


@NgModule({
  imports: [
    RouterModule.forRoot(routes)
  ],
  exports: [
    RouterModule
  ],
  declarations: []
})
export class AppRoutingModule { }
