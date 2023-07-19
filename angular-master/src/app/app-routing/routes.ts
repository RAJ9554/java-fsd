import { Routes } from '@angular/router';

import { HomeComponent } from '../home/home.component';
import { ProjectsComponent } from '../projects/projects.component';

export const routes: Routes = [
    { path: '', component:HomeComponent },
    {
        path: 'projects', component: ProjectsComponent,
        children: [
            { path: ':category', component: ProjectsComponent }
        ]
    },
    { path: '**', redirectTo: '', pathMatch: 'full' }
]
