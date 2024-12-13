
Farmora is a secure and user-friendly web platform designed to connect farmers directly with potential buyers, including both retail and wholesale clients. Built with a focus on simplicity and accessibility, Farmora aims to empower farmers by providing a seamless online marketplace to showcase and sell their products.
 Problem Statement
In many regions, farmers face challenges in connecting directly with buyers due to a lack of accessible platforms. Middlemen often dominate the supply chain, leading to reduced profits for farmers and inflated costs for buyers. Additionally, existing marketplaces are often complex and not designed with farmers' needs in mind, limiting their usability. There is a need for a simple, secure, and efficient solution to bridge this gap, enabling farmers to showcase their products directly to buyers and retain a larger share of their earnings.
 Solution Overview
Farmora addresses these challenges by providing a streamlined platform where:
- Farmers can easily create and manage product listings without needing technical expertise.
- Buyers can directly browse, filter, and purchase products from farmers, eliminating intermediaries.
- A secure sign-in system ensures that data integrity and user privacy are maintained.
- Admin functionalities allow for efficient management of platform activities, ensuring a smooth experience for all users.
By integrating these features, Farmora empowers farmers to expand their market reach and maximizes their profit margins while offering buyers direct access to fresh and affordable produce.
 Key Features
 1. Simple and Intuitive UI
- Designed to ensure ease of use for farmers with minimal technical expertise.
- Responsive design for seamless access on both desktop and mobile devices.
 2. Product Page
- Dedicated section for farmers to list their products with details like price, quantity, and availability.
- Buyers can browse through a variety of products and filter based on their needs.
 3. Secure Sign-In
- Robust authentication system ensuring data security.
- Role-based access control:
  - Farmers: Can add and manage product listings.
  - Buyers: Can view and purchase products.
  - Admin: Can monitor and manage user activities.

 4. Admin Module
- Comprehensive dashboard for managing:
  - User accounts (farmers and buyers).
  - Product listings.
  - Transactions and overall platform activity.
 Tech Stack
 Frontend:
- **HTML/CSS/JavaScript**: For creating a clean and accessible user interface.
- **Bootstrap**: For styling and responsive design.
 Backend:
- **Spring Boot**: For handling server-side logic.
- **Maven**: For project build and dependency management.
 Database:
- **MySQL**: For storing user data, product details, and transaction records securely.
 Installation and Setup
1. Download the project and open it in IntelliJ IDE.
2. Set up Maven configuration:
   - Go to the Maven section in IntelliJ.
   - Add a new configuration.
   - Select Maven.
3. Run the `pom.xml` file to install dependencies.
4. Open the `application.properties` file:
   - Change the database name to match your database.
   - Update the username and password with your database credentials.
5. Run the application:
   ```bash
   mvn spring-boot:run
   ```
6. Access the application:
   Open [http://localhost:8080](http://localhost:8080) in your web browser.
 Usage
 For Farmers:
- Sign up and log in to the platform.
- Add product details (name, price, quantity, description).
- Manage listings from your dashboard.
 For Buyers:
- Browse available products.
- Filter by category or location.
- Contact sellers or place orders directly.
 For Admin:
- Monitor all user activities and product listings.
- Remove inappropriate content or suspend accounts if necessary.
 Future Enhancements
- Multi-language support for better accessibility.
- Integration of payment gateways for seamless transactions.
- Real-time chat feature for direct communication between buyers and sellers.
- Analytics dashboard for farmers to track sales and performance.

 Developers
- Sahil
- Jagroop
- Colin
- Tarun Oza

---

Thank you for using Farmora! Together, let's empower farmers and build a stronger agricultural community.
