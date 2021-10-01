import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { Course } from './course';
import { CourseService } from './course.service';

@Component({
  templateUrl: './course-info.component.html'
})

export class CourseInfoComponent implements OnInit{

  course: any;

  constructor(private rotaAtiva: ActivatedRoute, private receivedCourse: CourseService) { }

  ngOnInit():void {
    this.receivedCourse.retrieveById(Number(this.rotaAtiva.snapshot.paramMap.get('id'))).subscribe({
      next: course => this.course = course,
      error: err => console.log('Error', err)
    });
  }

  Save():void{
    this.receivedCourse.Save(this.course).subscribe({
      next: course => console.log('Saved with success', course),
      error: err => console.log('Error', err)
    });
  }

}
