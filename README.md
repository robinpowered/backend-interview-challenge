# Robin Backend Interview Challenge

Welcome!

Here you will find a set of problems to solve when interviewing with the Robin backend team. These problems represent real-world scenarios you can expect to encounter while working at Robin.

We do not expect you to spend more than 1 hour on each challenge, and at most 3 hours for all challenges.

## Challenges

You will be building an HTTP API (REST or GQL) to help solve a user free/busy problem set. The endpoints and returned data can be of your own choosing. API design is part of the challenge, so think carefully about your routes and how you decide to return data.

![image](https://user-images.githubusercontent.com/3697804/139739278-d9dc85f8-1b22-421e-9c28-7352fabae715.png)
<sub>Example of Google Calendar's product finding time slots where users are available</sub>

Solve as many challenges as you have time for. It's more important to have a working solution vs. an elegant one. If you can't complete a challenge in the allotted time, don't worry about it. We recognize that you may have other obligations throughout the day and don't expect you to reserve more time for the project.

### Parameters
You can expect to be given a list of user ids and a time range as part of the API request.

### Challenge 1

Find times where all given users could meet given user ids and a time range, without considering working hours.

### Challenge 2

Find times where all given  users could meet given user ids and a time range, within their working hours.

### Challenge 3

Find each 15 minute block where users could meet given user ids and a time range, within their working hours and order the results by number of users who can attend. For example, users 1, 2, and 3 can meet for the 09:00 - 09:15 block whereas only users 2 and 3 can meet for the 09:15 - 09:30 block.

Bonus: Make the interval dynamic (you can pass it through as an API parameter).

### Response
Construct an appropriate response body that you think best represents the data.

### User Data

The user data is structured like this:
```json
[
    {
        "user_id": 1,
        "time_zone": "America/New_York",
        "working_hours": {
            "start": "09:00",
            "end": "17:00"
        },
        "events": [
            {
                "id": 2,
                "title": "Meeting B",
                "start": "2019-01-01T09:00:00+0000",
                "end": "2019-01-01T10:00:00+0000"
            },
            {
                "id": 4,
                "title": "Meeting D",
                "start": "2019-01-01T11:00:00+0000",
                "end": "2019-01-01T12:00:00+0000"
            },
            {
                "id": 6,
                "title": "Meeting F",
                "start": "2019-01-01T12:00:00+0000",
                "end": "2019-01-01T12:45:00+0000"
            },
            {
                "id": 8,
                "title": "Meeting H",
                "start": "2019-01-01T14:00:00+0000",
                "end": "2019-01-01T15:30:00+0000"
            }
        ]
    }
]
```

+ `user_id` - A unique identifier for the user
+ `time_zone` -  The user's IANA timezone. This applies to their `working_hours`
+ `working_hours` - The hours that a given user will be working. These apply for each day of the week (for example, 9AM-5PM Monday-Sunday)
+ `events` - A list of the user's events. All datetimes are represented in [ISO 8601 format](<https: //en.wikipedia.org/wiki/ISO_8601>) with a UTC timezone.

## Submitting

Either make a fork of or download this repository. Include a README that explains how to run your code, prerequisite installs to run it (if necessary), and what you would have done differently if you had more time.

During your interview, you'll walk us through your code. Please make sure your browser is setup to share your screen beforehand (Mac users check if your [browsers have screensharing enabled](https://support.apple.com/guide/mac-help/turn-screen-sharing-on-or-off-mh11848/mac)) We look forward to seeing your solutions!
