# SimpleConnectionSearchEngine

This is the simplest form of a search engine. There are two tables in the database (MySQL):
Bus (id, name (ex. ZZ1))
Route (id, date, Bus (oneToOne), route (as String ex. Berlin / Paris / Rome))
The search engine displays the available courses on the given day based on the date, start and end stops.

Application has one endpiont:
GET - get route with parameters "http=//localhost:8080/{date}/{startStop}/{endStop}"


## The search engine can be expanded by :

1. changing the search method from JPQL to criteria API 

2. changing the layout of the route table. You can add BusStops tables, add previous / present / next stop 
fields in the Route table to display the part of the route that meets your criteria

3. adding the dijkstra algorithm to search for the shortest route consistent with the given criteria







