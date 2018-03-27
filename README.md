Sample calls:

curl -s -X POST -d '{"items":[{"drink":{"id":100004,"class":"com.natashapetrenko.cafe.model.drinks.tea.ColdCarcade"},"additives":[],"accessories":[]}]}' -H 'Content-Type:application/json;charset=UTF-8' http://localhost:8080/cafe/rest/orders

curl -s http://localhost:8080/cafe/rest/orders/100000