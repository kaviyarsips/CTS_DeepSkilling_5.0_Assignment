import React from "react";

function App() {

  const officeList = [
    {
      name: "Skyline Business Center",
      rent: 55000,
      address: "Tidel Park, Chennai"
    },
    {
      name: "Tech Towers",
      rent: 75000,
      address: "OMR, Chennai"
    },
    {
      name: "Elite Work Hub",
      rent: 45000,
      address: "Guindy, Chennai"
    }
  ];

  return (
    <div style={{ padding: "20px" }}>
      <h1>Office Space Rental Application</h1>

      <img
        src="/office.jpg"
        alt="Office Space"
        width="500"
      />

      <br /><br />

      {officeList.map((office, index) => (
        <div
          key={index}
          style={{
            border: "1px solid black",
            borderRadius: "10px",
            padding: "15px",
            marginBottom: "20px"
          }}
        >
          <h2>{office.name}</h2>

          <h3
            style={{
              color: office.rent < 60000 ? "red" : "green"
            }}
          >
            Rent: ₹ {office.rent}
          </h3>

          <h4>Address: {office.address}</h4>
        </div>
      ))}
    </div>
  );
}

export default App;