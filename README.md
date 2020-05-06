# VTGPA
VTGPA is a Chrome Extension to display corresponding GPA data on the [Virginia Tech Timetable of classes](https://banweb.banner.vt.edu/ssb/prod/HZSKVTSC.P_DispRequest).

## Description
Using a Virginia Tech grade report generated from the University DataCommons, the CSV is parsed and turned into a RESTful web-service using Java and Spring. The Javascript is responsible for scraping each row of the timetable and performing a GET request on the server. The GPA data is then calculated specific to the instructor and course. If an instructor has never taught that course before, the GPA defaults to the overall course average. A new column is then added on the timetable and the relevant data is written in.
## Images
### Before
![Before](before.png)
### After
![After](after.png)

## Notes
This project was completed in 24 hours and is fairly rough. The backend needs a major rewrite for efficiency. The Chrome Extension is currently not in the Google Web Store, however, you can manually upload the folder. If you choose to do so, the Heroku server shuts down after 30 minutes of inactivity. Therefore, you will need to wait 45 seconds once you load the page for the first time (within 30 minutes). Stay tuned for updates soon!

## Members
* Matthew Betsill
* Ryan Bierly
* Ryan Marcus
* Pranav Chavvakula

## Awards
Virginia Tech: SheHacks 2020
* 1st place (out of 70 teams)

## Technology
### Front End
* Javascript  
  * JQuery  
* HTML/CSS
### Back End
* Java  
* Spring  
   * Maven
### Deployment
* Heroku

 
