import { ComponentFixture, TestBed } from '@angular/core/testing';

import { UpateEmpComponent } from './upate-emp.component';

describe('UpateEmpComponent', () => {
  let component: UpateEmpComponent;
  let fixture: ComponentFixture<UpateEmpComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ UpateEmpComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(UpateEmpComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
