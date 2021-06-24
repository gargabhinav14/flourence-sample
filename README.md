# flourence-sample-readme

login credentials:
uname:client
pass:client

ADD CATALOG
> POST /api/v1/catalog/add HTTP/1.1
> Host: localhost:8080
> User-Agent: insomnia/2021.2.2
> Cookie: JSESSIONID=EDD86ABAC21FE5500F97D45FB27DDE81; session_id=eyJhbGciOiJIUzI1NiJ9.eyJqdGkiOiJiZDVlMmY5My1jNTNmLTExZWItODNmYi1iMjQ3MWQwMzJiMTAtMzIiLCJpYXQiOjE2MjI4MTYzMTEsInN1YiI6ImFjY291bnRfdXNlciIsImlzcyI6ImthcmV4cGVydCIsImV4cCI6MzI0NTYzNDQyM30.l88NqFZ3xsHPPGdl-GjRDHyN8WGN_NAomOzJWNV3SPM
> Content-Type: application/json
> Authorization: Basic Y2xpZW50OmNsaWVudA==
> Accept: */*
> Content-Length: 56
| {
| 	"itemCode":"item_code_1",
| 	"itemName":"item_name_1"
| }


GET CATALOG
> GET /api/v1/catalog/get?page=0&size=10 HTTP/1.1
> Host: localhost:8080
> User-Agent: insomnia/2021.2.2
> Cookie: JSESSIONID=EDD86ABAC21FE5500F97D45FB27DDE81; session_id=eyJhbGciOiJIUzI1NiJ9.eyJqdGkiOiJiZDVlMmY5My1jNTNmLTExZWItODNmYi1iMjQ3MWQwMzJiMTAtMzIiLCJpYXQiOjE2MjI4MTYzMTEsInN1YiI6ImFjY291bnRfdXNlciIsImlzcyI6ImthcmV4cGVydCIsImV4cCI6MzI0NTYzNDQyM30.l88NqFZ3xsHPPGdl-GjRDHyN8WGN_NAomOzJWNV3SPM
> Authorization: Basic Y2xpZW50OmNsaWVudA==
> Accept: */*


UPDATE CATALOG
> PUT /api/v1/catalog/update/item_code_1 HTTP/1.1
> Host: localhost:8080
> User-Agent: insomnia/2021.2.2
> Cookie: session_id=eyJhbGciOiJIUzI1NiJ9.eyJqdGkiOiJiZDVlMmY5My1jNTNmLTExZWItODNmYi1iMjQ3MWQwMzJiMTAtMzIiLCJpYXQiOjE2MjI4MTYzMTEsInN1YiI6ImFjY291bnRfdXNlciIsImlzcyI6ImthcmV4cGVydCIsImV4cCI6MzI0NTYzNDQyM30.l88NqFZ3xsHPPGdl-GjRDHyN8WGN_NAomOzJWNV3SPM
> Content-Type: application/json
> Accept: */*
> Content-Length: 60

| {
| 	"itemCode":"item_code_1_1",
| 	"itemName":"item_name_1_1"
| }


DELETE CATALOG
> DELETE /api/v1/catalog/delete/item_code_1 HTTP/1.1
> Host: localhost:8080
> User-Agent: insomnia/2021.2.2
> Cookie: session_id=eyJhbGciOiJIUzI1NiJ9.eyJqdGkiOiJiZDVlMmY5My1jNTNmLTExZWItODNmYi1iMjQ3MWQwMzJiMTAtMzIiLCJpYXQiOjE2MjI4MTYzMTEsInN1YiI6ImFjY291bnRfdXNlciIsImlzcyI6ImthcmV4cGVydCIsImV4cCI6MzI0NTYzNDQyM30.l88NqFZ3xsHPPGdl-GjRDHyN8WGN_NAomOzJWNV3SPM
> Accept: */*


ADD TAG
> POST /api/v1/catalog/item_code_4/tags/add HTTP/1.1
> Host: localhost:8080
> User-Agent: insomnia/2021.2.2
> Cookie: JSESSIONID=EDD86ABAC21FE5500F97D45FB27DDE81; session_id=eyJhbGciOiJIUzI1NiJ9.eyJqdGkiOiJiZDVlMmY5My1jNTNmLTExZWItODNmYi1iMjQ3MWQwMzJiMTAtMzIiLCJpYXQiOjE2MjI4MTYzMTEsInN1YiI6ImFjY291bnRfdXNlciIsImlzcyI6ImthcmV4cGVydCIsImV4cCI6MzI0NTYzNDQyM30.l88NqFZ3xsHPPGdl-GjRDHyN8WGN_NAomOzJWNV3SPM
> Content-Type: application/json
> Authorization: Basic Y2xpZW50OmNsaWVudA==
> Accept: */*
> Content-Length: 91

| {
| 	"tags":[
| 		{
| 			"tagValue":"this is tag3"
| 		},
| 		{
| 			"tagValue":"this is tag4"
| 		}
| 	]
| }


GET ALL TAGS
> GET /api/v1/catalog/tags/get HTTP/1.1
> Host: localhost:8080
> User-Agent: insomnia/2021.2.2
> Cookie: JSESSIONID=EDD86ABAC21FE5500F97D45FB27DDE81; session_id=eyJhbGciOiJIUzI1NiJ9.eyJqdGkiOiJiZDVlMmY5My1jNTNmLTExZWItODNmYi1iMjQ3MWQwMzJiMTAtMzIiLCJpYXQiOjE2MjI4MTYzMTEsInN1YiI6ImFjY291bnRfdXNlciIsImlzcyI6ImthcmV4cGVydCIsImV4cCI6MzI0NTYzNDQyM30.l88NqFZ3xsHPPGdl-GjRDHyN8WGN_NAomOzJWNV3SPM
> Accept: */*

GET TAG MAPPED WITH CATALOG
> GET /api/v1/catalog/item_code_1/tags/get HTTP/1.1
> Host: localhost:8080
> User-Agent: insomnia/2021.2.2
> Cookie: session_id=eyJhbGciOiJIUzI1NiJ9.eyJqdGkiOiJiZDVlMmY5My1jNTNmLTExZWItODNmYi1iMjQ3MWQwMzJiMTAtMzIiLCJpYXQiOjE2MjI4MTYzMTEsInN1YiI6ImFjY291bnRfdXNlciIsImlzcyI6ImthcmV4cGVydCIsImV4cCI6MzI0NTYzNDQyM30.l88NqFZ3xsHPPGdl-GjRDHyN8WGN_NAomOzJWNV3SPM
> Accept: */*


DELETE TAGS MAPPED WITH CATALOG
> DELETE /api/v1/catalog/item_code_2/tags/delete HTTP/1.1
> Host: localhost:8080
> User-Agent: insomnia/2021.2.2
> Cookie: JSESSIONID=EDD86ABAC21FE5500F97D45FB27DDE81; session_id=eyJhbGciOiJIUzI1NiJ9.eyJqdGkiOiJiZDVlMmY5My1jNTNmLTExZWItODNmYi1iMjQ3MWQwMzJiMTAtMzIiLCJpYXQiOjE2MjI4MTYzMTEsInN1YiI6ImFjY291bnRfdXNlciIsImlzcyI6ImthcmV4cGVydCIsImV4cCI6MzI0NTYzNDQyM30.l88NqFZ3xsHPPGdl-GjRDHyN8WGN_NAomOzJWNV3SPM
> Accept: */*


GET CATALOG BASED ON TAG SEARCH
> GET /api/v1/catalog/get?search=this%20is%20tag2&page=0&size=1 HTTP/1.1
> Host: localhost:8080
> User-Agent: insomnia/2021.2.2
> Cookie: JSESSIONID=EDD86ABAC21FE5500F97D45FB27DDE81; session_id=eyJhbGciOiJIUzI1NiJ9.eyJqdGkiOiJiZDVlMmY5My1jNTNmLTExZWItODNmYi1iMjQ3MWQwMzJiMTAtMzIiLCJpYXQiOjE2MjI4MTYzMTEsInN1YiI6ImFjY291bnRfdXNlciIsImlzcyI6ImthcmV4cGVydCIsImV4cCI6MzI0NTYzNDQyM30.l88NqFZ3xsHPPGdl-GjRDHyN8WGN_NAomOzJWNV3SPM
> Authorization: Basic Y2xpZW50OmNsaWVudA==
> Accept: */*
