# Using GitHub Repository

1. Create an account on GitHub
2. Generate SSH Key
	```
	ssh-keygen -t ed25519 -C "your_email@example.com"
	```
3. Install Git Command
	```
	winget install --id Git.Git -e --source winget
	```
4. Create a repository on GitHub
5. Clone Repository
	Copy SSH command from your repository
	```
	git clone git@github.com:minlwin/online-basic-202609.git
	```