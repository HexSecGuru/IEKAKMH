import json

# Python dictionary
d = {'id': '09', 'name': 'Nitin', 'department': 'Finance'}

print("\nNow Convert from JSON to Python")

# Convert Python dict to JSON string and back to Python dict
obj = json.loads(json.dumps(d))
print("Converted to Python", type(obj))
print(obj)

# Write JSON data to file
with open("data.json", "w") as write_file:
    json.dump(d, write_file, indent=4)
print("\nData has been written to 'data.json'")

# Read JSON data back from file
with open("data.json", "r") as read_file:
    data = json.load(read_file)
print("Read from file:", type(data))
print(data)
