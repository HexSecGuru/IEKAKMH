import json
from urllib.request import urlopen

# 1️⃣ Complex nested Python structure
company_data = {
    "company": "TechCorp",
    "employees": [
        {"id": 1, "name": "Alice", "role": "Engineer", "skills": ["Python", "AI", "Cloud"]},
        {"id": 2, "name": "Bob", "role": "Designer", "skills": ["Figma", "UI/UX"]},
        {"id": 3, "name": "Charlie", "role": "Manager", "skills": []}
    ],
    "location": {"city": "New York", "country": "USA"}
}

# 2️⃣ Convert to JSON string (pretty format)
json_string = json.dumps(company_data, indent=4, sort_keys=True)
print("Pretty JSON output:\n", json_string)

# 3️⃣ Write to a JSON file
with open("company.json", "w") as f:
    json.dump(company_data, f, indent=4)
print("\nData written to 'company.json'")

# 4️⃣ Read JSON back from file
with open("company.json", "r") as f:
    loaded_data = json.load(f)
print("\nLoaded from file:", type(loaded_data))

# 5️⃣ Access nested values safely
for employee in loaded_data.get("employees", []):
    print(f"Employee: {employee['name']} — Skills: {', '.join(employee['skills']) or 'None'}")

# 6️⃣ Optional: Load JSON data from a public API (example)
try:
    with urlopen("https://jsonplaceholder.typicode.com/users") as response:
        users = json.load(response)
        print(f"\nFetched {len(users)} users from API.")
        print("Example user:", users[0]["name"], "-", users[0]["email"])
except Exception as e:
    print("\nCould not fetch data from API:", e)
