import { HttpClientModule } from '@angular/common/http';
import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { RouterModule } from '@angular/router';

import { AppComponent } from './app.component';
import { CoreModule } from './core/core.module';
import { CourseModule } from './courses/course-module';

@NgModule({
  declarations: [
    AppComponent
  ],

  imports: [
    CourseModule,
    BrowserModule,
    HttpClientModule,
    CoreModule,
    RouterModule.forRoot([
      {
        path: '', redirectTo: 'courses', pathMatch: 'full'
      }

    ])
  ],

  providers: [],
  bootstrap: [AppComponent]
})

export class AppModule { }