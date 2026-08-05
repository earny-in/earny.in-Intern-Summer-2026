movies = []

for i in range(5):
  movie = (input(f"movies {i+1}:  "))
  movies.append(movie)

print("favorite movies")

for i in range(5):
  print(f"movie{i+1}:{movies[i]}")  
