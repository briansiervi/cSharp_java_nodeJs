using System;
using System.Collections.Generic;
using System.Linq;

namespace csharp
{
    class Program
    {
        public static string FirstUniqueProduct(string[] products)
        {
            // Dictionary<string, int> productsCount = new Dictionary<string, int>();

            // foreach (var product in products)
            // {
            //     if (!productsCount.ContainsKey(product))
            //     {
            //         productsCount.Add(product, 1);
            //     }else{
            //         productsCount.Remove(product);
            //     }
            // }
            // return productsCount.Keys.First();           

            List<String> productsAux = new List<String>();

            foreach (var item in products)
            {
                if (!productsAux.Contains(item))
                {
                    productsAux.Add(item);
                }else{
                    productsAux.Remove(item);
                }
            }
            
            if (productsAux.Count > 0)
            {
                return products[0];
            }else{
                return "";
            }
        }

        public static void Main(string[] args)
        {
            Console.WriteLine(FirstUniqueProduct(new string[] { "Apple", "Computer", "Apple", "Bag" }));
        }
    }
}
