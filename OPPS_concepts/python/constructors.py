class person_info:
    name=''
    mobile=''
    email=''
    def __init__(self,name,mobile,email):

        self.name=name
        self.mobile=mobile
        self.email=email
        print(__str__)


person=person_info("Himanshu","himanshu@gmail.com","3453445")

print(person.name)
print(person.email)
print(person.mobile)

print(dir(person))


