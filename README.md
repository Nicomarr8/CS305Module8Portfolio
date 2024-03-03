This is a portfolio for a Class at my college, please ignore it, it is not an element of my professional portfolio

The client "Artemis Financial" is a consulting company that develops financial plans for customers. These include savings, retirement, investments, and insurance. They wanted me to review the security of their software and provide feedback and fixes for it. 

When I found the security vulnerabilities I found fixes for them by looking at OWASP, looking for dependency issues and looking for a way to encrypt and hash the data that they were transfering. Since the company has to deal with very sensitive data like financial information they need security on their information transfers. This is high value data that cannot be allowed into malicious hands. If the data is insecure customers will turn away from teh company as they will not trust them to handle their transactions.

I found the whole vulnerability assessment to be fine and easy enough, I think the most helpful part was the dependency check as I would otherwise have no idea about any of those vulnerabilities. I think that the dependency check is complicated and can be a little hard to figure out how to handle the issues it brings up but being able to see them is a huge plus.
I increased layers of security by adding encryption to the code, by implimenting AES encryption on the transmissions and hashing the data along with implimenting a certificate signed locally on my machine I was able to encrypt the data and create an https connection that ensures security. In the future I would use the flowchart we kept using in class to determine vulnerabilities and check them myself.

I checked if hte code was functional by running the code and verifying the functions worked correctly. I made sure no new vulernabilities were introduced by running the dependency check and checking off the flowchart's steps in my code, verifying that each type of vulernability was handled or not present.

The flowchart for vulnerabilities was useful, the dependency check library was useful and the textbook was very useful. I think these things will be items i carry on into the future and use later in my career.

I could show the codebases I have modified and made functional. I think that those would be valuable for potential employers and would be good representations of my skills as a programmer.
