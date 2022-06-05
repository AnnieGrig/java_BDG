package lesson8;

public class Program {
    public static void main(String[] args) {
        Company firstCompany = new Company();
        firstCompany.name = "A";

        Company secondCompany = new Company();
        secondCompany.name = "B";

        Person person1 = new Person();
        person1.name = "Lilit";
        person1.balance = 5000;
        person1.workCompany = firstCompany;

        Person person2 = new Person();
        person2.name = "Ani";
        person2.balance = 4000;
        person2.workCompany = secondCompany;

        Person person3 = new Person();
        person3.name = "Gohar";
        person3.balance = 4500;
        person3.workCompany = secondCompany;

        Person person4 = new Person();
        person4.name = "Lusine";
        person4.balance = 5500;
        person4.workCompany = secondCompany;

        Person person5 = new Person();
        person5.name = "Arsen";
        person5.balance = 5300;
        person5.workCompany = firstCompany;

        Person person6 = new Person();
        person6.name = "Hovhannes";
        person6.balance = 8000;
        person6.workCompany = firstCompany;

        person1.sendMoney(person3, 2000);
        System.out.println(person1.name + " - " + person1.balance);
        System.out.println(person3.name + " - " + person3.balance);

        person5.sendMoney(person4, 500);
        System.out.println(person5.name + " - " + person5.balance);
        System.out.println(person4.name + " - " + person4.balance);

        person2.sendMoney(person6, 20);
        System.out.println(person2.name + " - " + person2.balance);
        System.out.println(person6.name + " - " + person6.balance);

        Person[] peopleArr = new Person[6];
        peopleArr[0] = person1;
        peopleArr[1] = person2;
        peopleArr[2] = person3;
        peopleArr[3] = person4;
        peopleArr[4] = person5;
        peopleArr[5] = person6;

        Company[] companiesArr = new Company[2];
        companiesArr[0] = firstCompany;
        companiesArr[1] = secondCompany;


        Person theReachPerson = returnAPersonWithMostBalance(peopleArr);
        System.out.println("The reach person is " + theReachPerson.name);

        Company company = returnHighestValueOfCompany(companiesArr, peopleArr);
        System.out.println("The reach company is " + company.name);
    }

    public static Person returnAPersonWithMostBalance(Person[] peopleArr) {
        Person max = peopleArr[0];
        for (int i = 0; i < peopleArr.length; i++) {
            for (int j = 1; j < peopleArr.length; j++) {
                if (peopleArr[j].balance > max.balance) {
                    max = peopleArr[j];
                }
            }
        }
        return max;
    }


    public static Company returnHighestValueOfCompany(Company[] companies, Person[] people) {
        double firstCompanySum = 0;
        double secondCompanySum = 0;

        for (int i = 0; i < people.length; i++) {
            if (people[i].workCompany.name == companies[0].name) {
                firstCompanySum += people[i].balance;
            } else {
                secondCompanySum += people[i].balance;
            }
        }

        if (firstCompanySum > secondCompanySum) {
            return companies[0];
        } else {
            return companies[1];
        }
    }

}