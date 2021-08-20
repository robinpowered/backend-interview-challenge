# Robin Backend Interview Challenge

Welcome!

Here you will find a set of problems to solve when interviewing with the Robin backend team. These problems represent real-world scenarios you can expect to encounter while working at Robin.

We do not expect you to spend more than 1 hour on each challenge, and at most 4 hours for all challenges.

## Challenges

You will be building a JSON REST API. The endpoints and returned data can be of your own choosing. API design is part of the challenge, so think carefully about your routes and how you decide to return data.

Solve as many challenges as you have time for. It's more important to have a working solution vs. an elegant one. If you can't complete a challenge in the allotted time, don't worry about it. We recognize that you may have other obligations throughout the day and don't expect you to reserve more time for the project.

### Parameters
You can expect to be given a list of user ids and a time range as part of the API request.

### Challenge 1

Find times where users could meet given user ids and a time range, without considering working hours.

### Challenge 2

Find times where users could meet given user ids and a time range, within their working hours.

### Challenge 3

Find times where users could meet given user ids and a time range, within their working hours and order the results by number of users who can attend.

### Response
Construct an appropriate JSON response body that you think best represents the data.

### User Data

The user data is structured like this:
```
[
  {
    "user_id": 1,
    "time_zone": "UTC",
    "working_hours": {
      "start": "09:00",
      "end": "17:00"
    },
    "events": [
      {
        "id": 2,
        "title": "Meeting B",
        "from": "2019-01-01T09:00:00+0000",
        "to": "2019-01-01T10:00:00+0000"
      },
      {
        "id": 4,
        "title": "Meeting D",
        "from": "2019-01-01T11:00:00+0000",
        "to": "2019-01-01T12:00:00+0000"
      },
      {
        "id": 6,
        "title": "Meeting F",
        "from": "2019-01-01T12:00:00+0000",
        "to": "2019-01-01T12:45:00+0000"
      },
      {
        "id": 8,
        "title": "Meeting H",
        "from": "2019-01-01T14:00:00+0000",
        "to": "2019-01-01T15:30:00+0000"
      }
    ]
  }
]
```

`user_id` is the user's id

`time_zone` is the user's IANA timezone

`working_hours` are the hours that the user has set that they will be in the office. Usually the working hours of someone in the US are from 9 am - 5 pm, for example.

`events` is a list of the user's events. All datetimes are represented in [ISO 8601 format](<https: //en.wikipedia.org/wiki/ISO_8601>) with a UTC timezone.

## Submitting

Include a README that explains how to run your code, prerequisite installs to run it (if necessary), and what you would have done differently if you had more time. Feel free to update and push directly to this fork.

During your interview, you'll walk us through your code. We look forward to seeing your solutions!
