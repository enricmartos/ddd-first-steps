.PONY: all build test

build:
	@./gradlew build --warning-mode all

run-tests:
	@./gradlew test --warning-mode all

run:
	@./gradlew :run

# Start the app
start-mooc_backend:
	@./gradlew :run --args='mooc_backend server'
