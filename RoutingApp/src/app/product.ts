export class Product {
    prdId:number;
    prdName:string;
    prdPrice:number;
    prdBrand:string;

    constructor(pid:number, pname:string, cost:number, brand:string)
    {
        this.prdId=pid;
        this.prdName=pname;
        this.prdBrand=brand;
        this.prdPrice=cost;
    }
}
