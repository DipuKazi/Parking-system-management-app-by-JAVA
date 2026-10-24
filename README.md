# 🚗 Vehicle Parking Management System

A desktop application built with **Java Swing** to manage a small parking lot. It lets an operator log in, park vehicles in numbered slots, check out vehicles, track earnings, and adjust parking rates, all through a simple graphical interface.

---

## ✨ Features

- **Secure login screen** to access the system
- **Add vehicle**: choose 2-wheeler, 3-wheeler or 4-wheeler, then enter owner name, vehicle number, phone number and slot number
- **Slot management**: 10 parking slots (1–10) with a check that prevents double-booking an occupied slot
- **Vehicle list**: view all currently parked vehicles
- **Depart vehicle**: free up a slot when a vehicle leaves
- **Parking charges**: view and change the fee for each vehicle type
- **Collections**: see total earnings, broken down by 2/3/4-wheelers
- **History**: counts of all vehicles that have been parked
- **Persistent data**: slot data, charges and history are saved in plain `.txt` files, so no database is needed

---

## 🛠️ Tech Stack

| Item | Details |
|------|---------|
| Language | Java (project configured for JDK 21) |
| GUI | Java Swing (`javax.swing`) |
| Storage | Plain text files |
| Build | Apache Ant (NetBeans project) |

---

## 📁 Project Structure

```
Icon/
├── src/SWING/
│   ├── Login.java                  # Login screen
│   ├── WelcomeFrame.java           # Welcome screen
│   ├── Menu.java                   # Main menu
│   ├── AddVehicle.java             # Choose vehicle type
│   ├── Data_Entry_Two/Three/Four   # Entry forms for 2/3/4-wheelers
│   ├── AddVehicleBackend.java      # Slot data logic + file read/write
│   ├── VehicleList.java            # Parked vehicles view
│   ├── DepartVehicle.java          # Check-out screen
│   ├── Parkingcharges.java         # Charges logic + file storage
│   ├── ParkingCharge.java          # View charges screen
│   ├── Change_Parking_Charges.java # Edit charges (CPC_two/three/four)
│   ├── Collection.java             # Earnings screen
│   ├── CollectionBackend.java      # Earnings logic
│   ├── History.java                # History screen
│   ├── HistoryBackend.java         # History logic + file storage
│   └── *.png / *.jpg / *.gif       # UI images
├── name.txt, vehicle_number.txt,
│   vehicle_type.txt, phone_number.txt,
│   occupy.txt                      # Slot data (one line per slot)
├── ParkingCharges.txt              # Fee for 2/3/4-wheelers
├── History.txt                     # Vehicle counts
├── build.xml
└── nbproject/                      # NetBeans project settings
```

---

## ▶️ Getting Started

### Prerequisites

- **JDK 21** (or a compatible version, you may need to change `javac.source` / `javac.target` in `nbproject/project.properties` if you use an older JDK)
- Any Java IDE (NetBeans recommended, since this is a NetBeans project; IntelliJ IDEA and Eclipse also work)

### Run with an IDE

1. Clone the repository:
   ```bash
   git clone https://github.com/DipuKazi/Parking-system-management-app-by-JAVA.git
   ```
2. Open the **`Icon`** folder as a project in your IDE.
3. Open `Icon/src/SWING/Login.java`.
4. Run the file.

> ⚠️ Run the app from the `Icon` folder so it can find the `.txt` data files (they are read using relative paths).

### Run from the command line

```bash
cd Icon
mkdir -p out
javac -d out src/SWING/*.java
cp src/SWING/*.png src/SWING/*.jpg src/SWING/*.gif out/SWING/
java -cp out SWING.Login
```

---

## 🔑 Default Login

| Username | Password |
|----------|----------|
| `ashik`  | `dipu`   |

> These credentials are hard-coded in `Login.java` for demo purposes. Change them there before using the app for anything real.

---

## 🧭 How to Use

1. **Log in** with the credentials above.
2. From the **Menu**, pick an option:
   - **Add Vehicle** → select vehicle type → fill in the form → choose a free slot (1–10)
   - **Vehicle List** → see who is parked where
   - **Depart Vehicle** → check a vehicle out and free its slot
   - **Parking Charges** → view or update the fee per vehicle type
   - **Collections** → see how much has been earned
   - **History** → see how many vehicles have been parked
3. Click **Exit** to close the app.

---

## ⚠️ Known Limitations

- Fixed number of slots (10), set in the source code
- Login credentials are hard-coded
- Collection totals are kept in memory, so they reset when the app is closed
- Data is stored in plain text files with no encryption

## 🚀 Ideas for Future Improvements

- Store data in a database (SQLite / MySQL)
- Calculate fees by parking duration instead of a flat rate
- Proper user accounts with hashed passwords
- Configurable number of slots
- Search and filter in the vehicle list
- Export reports to CSV / PDF

---

## 🤝 Contributing

Contributions, issues and feature requests are welcome. Fork the repo, create a branch, and open a pull request.

## 📄 License

This project is available for educational and learning purposes.

## 👤 Author

**Kazi Md. Naim Uddin**
GitHub: [DipuKazi](https://github.com/DipuKazi)
