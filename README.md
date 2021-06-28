#DevOps Technical Assessment
[![CircleCI](https://circleci.com/gh/LinuxEvangelist/devops/tree/development.svg?style=svg)](https://app.circleci.com/pipelines/github/LinuxEvangelist/devops?branch=development)

**Get JWT User**
~~~~
curl -X POST \
  http://localhost:8080/user \
  -H 'cache-control: no-cache' \
  -H 'content-type: application/x-www-form-urlencoded' \
  -H 'postman-token: 715b4972-63b5-573c-4c3c-43b21a69f237' \
  -d 'user=rllontop&password=pwd'
~~~~
**Post Devops Message
~~~~
curl -X POST \
  http://localhost:8080/api/v1/DevOps \
  -H 'cache-control: no-cache' \
  -H 'content-type: application/json' \
  -H 'postman-token: d14e2ca4-aeb2-9751-3e76-1389be226fac' \
  -H 'x-jwt-kwy: eyJhbGciOiJIUzUxMiJ9.eyJqdGkiOiJEZXZvcHMiLCJzdWIiOiJybGxvbnRvcCIsImF1dGhvcml0aWVzIjpbIlJPTEVfVVNFUiJdLCJpYXQiOjE2MjQ4NTI3MjUsImV4cCI6MTYyNDg1MzMyNX0.wrRv_Z3sCCMoxj0IdrMnG6eALBVuE7fLPsNdcNwK3-zzjBrVyRyi_ffvB97ZUmhZMcbgSE7UAnRXunsGBkLvXg' \
  -H 'x-parse-rest-api-key: 2f5ae96c-b558-4c7b-a590-a501ae1c3f6c' \
  -d '{
"message" : "This is a test",
"to": "Juan Perez",
"from": "Rita Asturisa",
"timeToLifeSec" : 45
}'
~~~~