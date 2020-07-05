# StudentHelperApp
-This is a school project/android application whose main task is to ilustrate how to fetch data from API and save it in local database and also how to work with localbase. 
-It contains 3 parts:
1. first of them is splash activity that checks if user is logged, if he's not, he has to log in.
2. if user is logged, he will see 3 windows (fragments shown with view pager). One window is used to show data fetched from API of my faculty (timetable). You can also filter timetable data by day, group, teacher or subject. User can also creates notes, which will be stored in local data base. User can search notes by title or content, delete, change, add and archive note.
4. Third fragment in view pager contains graph that shows number of created note in the last five days.

-Tehnologies used in project: on presentation layer I used ViewModel and LiveData. LiveData stores states of data structures. User's info is stored in SharedPreferances.  All data are delivered and saved in repository (whose location is data layer). Room is used for communication with database. Retrofit is used for communication with server. CustomView is 
user for drawing a graph.

