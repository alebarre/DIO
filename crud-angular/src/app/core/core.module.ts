import { NgModule } from "@angular/core";
import { NaviBarComponent } from "./component/nav-bar/nav-bar.component";
import { RouterLink, RouterModule } from '@angular/router';
import { Error404Component } from "./component/error404/error404.component";

@NgModule({
  declarations: [
    NaviBarComponent,
    Error404Component
  ],
  imports: [
    RouterModule.forChild([
      {
        path: '**', component: Error404Component
      }
    ])
  ],
  exports:[
    NaviBarComponent
  ]
})

export class CoreModule{

}
