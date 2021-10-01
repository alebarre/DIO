import { ModuleWithProviders } from '@angular/core';
import { Route, RouterModule, Routes } from '@angular/router';

import { Error404Component } from '../core/component/error404/error404.component';
import { CourseListComponent } from './course-list.component';


const APP_ROUTES: Routes = [
  { path: '', component: CourseListComponent  },
  { path: 'courses', component: CourseListComponent },
  { path: '**', component: Error404Component }
];

export const routing: ModuleWithProviders<Route> = RouterModule.forRoot(APP_ROUTES);

