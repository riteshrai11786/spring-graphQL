# spring-boot-graphQL


There are 2 read APIs for adding list of persons and getting them:

POST -> localhost:8080/addPersons with below JSON to H2 DB

[{
    "id": 123456,
    "firstName" : "XXXX1",
    "lastName": "XX",
    "phoneNumber": "7890000123",
    "addresses" : ["AB", "GH", "DF"]
},
{
    "id": 32456,
    "firstName" : "XXXX2",
    "lastName": "DDF",
    "phoneNumber": "7702000123",
    "addresses" : ["SD", "GP", "AP"]
}
]


GET -> localhost:8080/persons

GRAPHQL query APIs: 

POST -> localhost:8080/getAll (below raw query can be modified to levarege the graphQL feature)

{
    getAllPerson{
        firstName
        lastName
        phoneNumber
    }
}
