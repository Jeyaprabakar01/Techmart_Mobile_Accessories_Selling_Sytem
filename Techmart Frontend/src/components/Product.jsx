function Product(props) {
  const { x, showModal } = props;
  return (
    <div className="col-sm-3" key={x.prodid}>
      <div
        className="card text-center text-white mb-3 bg-transparent"
        style={{ boxShadow: "0 0 2px 2px white" }}
      >
        <div className="card-header p-1 border-bottom border-white">
          <h5>{x.pname}</h5>
        </div>
        <div className="card-body py-1">
          <img
            style={{ width: "100%", height: "250px", marginBottom: "5px" }}
            src={"http://localhost:8080/" + x.photo}
            className="img-thumnail"
          />
          <h6 className="float-left">Brand :{x.brand}</h6>
          <h6 className="float-right">Price: &#8360; {x.price}</h6>
        </div>
        <div className="card-footer p-1">
          <button
            onClick={(e) => showModal(x)}
            className="btn btn-light btn-sm"
          >
            Buy Now
          </button>
        </div>
      </div>
    </div>
  );
}

export default Product;
