Day 2: Operators

    static void solve(double meal_cost, int tip_percent, int tax_percent) {
        int total_cost = (int) Math.round(meal_cost + (meal_cost * tip_percent * 0.01) + (meal_cost * tax_percent * 0.01));
        System.out.println(total_cost);
    }
