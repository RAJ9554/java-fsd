# vinaysomawat.github.io-Angular

This project is the angular version of [portfolio site](https://vinaysomawat.github.io).

This project was generated with [Angular CLI](https://github.com/angular/angular-cli) version 6.2.1.

## Development server

Run `npm install` to install package.json.
Run `ng serve` for a dev server. 
Navigate to `http://localhost:4200/`. 

Add the portfolio data to `src/app/shared/details.ts` file.

```
{
        name: '',
        image: '/angular/assets/images/profile.jpg',
        summary: 'I am a software developer engineer and computer science undergraduate student at National Institute of Technology, Warangal.',
        banner: 'You will be happy to know that I have completed over 20+ projects successfully!',
        skills: [
            {
                name: 'Algorithms/C++(STL)',
                progress: 'width:50%',
                progressval: '50'
            }
        ],
        github: 'https://github.com/vinaysomawat',
        githubusername: 'vinaysomawat',
        buymecoffee: 'https://www.buymeacoffee.com/r194dME8y',
        quora: 'https://quora.com/profile/Vinay-Somawat',
        linkdin: 'https://www.linkedin.com/in/vinaysomawat/',
        workExperience: [
            {
                company: 'ThinkPedia LLP',
                role: 'Software Developement Engineering Intern',
                duration: 'May 2019 - June 2019',
                summary:[
                    {
                        summaryline: 'Developed Customer Web Application for social media management from scratch.'
                    },
                    {
                        summaryline: 'Designed frontend with Angular 7 and backend services with Java framework spring-boot.'
                    },
                    {
                        summaryline: 'Worked in System Design, System Testing, API Integration and Cloud Services for the deployment and production of the application.'
                    }
                ] 
            }
        ],
        education: [
            {
                degree: 'Bachelors in Computer Science and Engineering',
                institute: 'National Institute of Technology, Warangal',
                summary: [
                    {
                        summaryline: 'Courses undertaken Data Strucutures and Algorithms, Operating Systems, Database Management Systems, Networks, Distributed Computing, Object Oriented Programming, Computer Architecture.'
                    }
                ]
            }
        ],
        mail: 'vinaysomawat40@gmail.com',
        socialMedia: [
            {
                name: 'Linkdin',
                link: 'https://www.linkedin.com/in/vinaysomawat/'
            }
        ],
        cpprofile: [
            {
                name: 'CodeChef',
                link: 'https://www.codechef.com/users/somawatvinay'
            }
        ],
        androiddevproject: [
            {
                projectname: 'NITW-CSE',
                image: '/angular/assets/images/nitwcse.jpg',
                summary: 'App contains details of Dept courses, ref. books, research, publication and faculty profile.',
                preview: 'https://github.com/vinaysomawat/NITW-CSE',
                techstack: [
                    {
                        name: 'java'
                    },
                    {
                        name: 'XML'
                    },
                    {
                        name: 'Photoshop'
                    }
                ]
            }
        ],
        softwaredevproject: [
            {
                projectname: 'Pizza Ordering ChatBOT',
                image: '/angular/assets/images/pizzaorderchatbot.png',
                summary: 'ChatBot using Dialogflow, Firebase database which stores the chat data in the realtime database.',
                preview: 'https://github.com/vinaysomawat/Pizza-Ordering-ChatBot',
                techstack: [
                    {
                        name: 'DialogFlow'
                    },
                    {
                        name: 'Firebase'
                    }
                ]
            }
        ],
        webdevproject: [
            {
                projectname: 'Travographer-Portal',
                image: '/angular/assets/images/tg-portal.png',
                summary: 'It is an implementation to Setup Amazon S3 in a Django Project, how to use S3 to handle user uploaded files.',
                preview: 'https://github.com/vinaysomawat/Travographer-Portal',
                techstack: [
                    {
                        name: 'Django'
                    },
                    {
                        name: 'AWS'
                    }
                ]
            }
        ]
    };
```

## Host on gh-pages

Run `sudo npm install -g angular-cli-ghpages` to install angular-cli-ghpages.

Run ` ng build --prod --base-href "https://<username>.github.io/<projectname>/"` to build the project. The build artifacts will be stored in the `dist/` directory.

Run `ngh --dir dist/angular` to push the dist/angular package to git branch.

## Live

The project is live on `https://<username>.github.io/<projectname>/`.

